$(document).ready(function() {
	
	// 用户登录校验
	checkLogin(function() {
		
		var path = getRootPath();
		
		// 模板初始化
		var ractive = new Ractive({
			el: ".content",
			template: "#template",
			oncomplete: function() {
				
				// 初始化查询考评对象
				search();
			}
		});
		
		// 查询考评对象
		function search() {
			var xm = ractive.get("xm");
			var param = {
				xm: xm
			};
			$.ajax({
				url: path + "/evaluation/ydkp/getKpdx",
				type: "POST",
				dataType: "json",
				data: JSON.stringify(param),
				contentType: "application/json",
				success: function(data) {
					// 模拟码表转换
					for (var i in data) {
						if (data[i].zw == "1") {
							data[i].zwDesc = "人事主管";
						} else if (data[i].zw == "2") {
							data[i].zwDesc = "软件工程师";
						} else if (data[i].zw == "3") {
							data[i].zwDesc = "运维";
						} else if (data[i].zw == "4") {
							data[i].zwDesc = "业务分析";
						} else if (data[i].zw == "5") {
							data[i].zwDesc = "行政总监";
						}
					}
					var list = [];
					var array = [];
					for (var i = 0; i < data.length; i++) {
						if (i % 3 == 0) {
							if (array.length > 0) {
								var param = list.push(array);
								if (param) {
									array = [];
								}
							}
						}
						array.push(data[i]);
						if ((i === data.length - 1) && (i % 3 != 0)) {
							list.push(array);
						}
					}
					ractive.set("list", list);
				}
			});
		}
		
		// 模板中事件绑定
		ractive.on({
			search: function() {
				search();
			},
			selected: function(event) {
				var $dom = $(event.node);
				$(".click-obj").removeClass("border-red");
				$dom.addClass("border-red");
				var bkhrid = $dom.attr("bkhrid");
				ractive.set("id", bkhrid);
			},
			start: function(event) {
				var flag = false;
				var count = 0;
				$(".click-obj").each(function(index, items) {
					if ($(this).hasClass("border-red")) {
						flag = true;
						count++;
					}
				});
				if (count == 1 && flag) {
					var $dom = $(event.node);
					var bkhrid = $dom.attr("bkhrid");
					location.href = "ydkp.html?bkhrid=" + bkhrid;
				} else if (count > 1 && flag) {
					alert("系统异常");
				} else {
					alert("请选择一个考评对象");
				}
			},
			back: function() {
				location.href = "index.html";
			}
		});
	});
});