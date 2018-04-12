$(document).ready(function() {
	
	// 用户登录校验
	checkLogin(function() {
		
		var path = getRootPath();
		
		var page = 0;
		
		var bkhrid = getParamByUrl("bkhrid");
		
		// 模板初始化
		var ractive = new Ractive({
			el: ".content",
			template: "#template",
			oncomplete: function() {
				// 初始化考评指标
				initKpzb();
			}
		});
		
		// 初始化考评指标
		function initKpzb() {
			$.ajax({
				url: path + "/evaluation/ydkp/getKpzb",
				type: "GET",
				dataType: "json",
				contentType: "application/json",
				success: function(data) {
					ractive.set("page", page);
					ractive.set("zbmc", data[0].zbmc);
					ractive.set("list", data);
				}
			});
		}
		
		// 模板中事件绑定
		ractive.on({
			preTopic: function(event) {
				var $page = $(event.node).attr("page");
				$("#khzb" + $page).hide();
				var list = ractive.get("list");
				var $newPage = parseInt($page) - 1;
				ractive.set("zbmc", list[$newPage].zbmc);
				ractive.set("page", $newPage);
				$("#khzb" + $newPage).show();
			},
			nextTopic: function(event) {
				var $page = $(event.node).attr("page");
				$("#khzb" + $page).hide();
				var list = ractive.get("list");
				var $newPage = parseInt($page) + 1;
				ractive.set("zbmc", list[$newPage].zbmc);
				ractive.set("page", $newPage);
				$("#khzb" + $newPage).show();
			},
			submit: function() {
				var list = ractive.get("list");
				var array = [];
				for (var i = 0; i < list.length; i++) {
					var sszbid = list[i].id;
					$(".zb" + sszbid).each(function(index, items) {
						if ($(this).is(":checked")) {
							var $dom = $(this);
							var khfjid = $dom.attr("khfjid");
							var khzbid = $dom.attr("khzbid");
							var fz = $dom.attr("fz");
							var obj = {
								bkhrid: bkhrid,
								khfjid: khfjid,
								khzbid: khzbid,
								fjdf: fz
							};
							array.push(obj);
						}
					});
				}
				var param = {
					bkhrid: bkhrid,
					khjlParams: array
				};
				$.ajax({
					url: path + "/evaluation/ydkp/insertKhjl",
					type: "POST",
					dataType: "json",
					data: JSON.stringify(param),
					contentType: "application/json",
					success: function(data) {
						alert("提交成功");
					}
				});
			},
			back: function() {
				location.href = "xzkpdx.html";
			}
		});
	});
});