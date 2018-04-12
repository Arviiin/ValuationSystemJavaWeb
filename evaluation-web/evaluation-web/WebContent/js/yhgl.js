$(document).ready(function() {
	
	// 是否登录校验
	checkLogin(function() {
		
		var path = getRootPath();
		
		// 初始化模板引擎
		var ractive = new Ractive({
			el: ".content",
			template: "#template",
			oncomplete: function() {
				
				// 事件绑定
				bind();
				
				// 初始化职位下拉框
				initZwList();
				
				// 初始化查询用户
				search();
			}
		});
		
		// 事件绑定
		function bind() {
			// 显示新增用户弹框
			$(".show").bind("click", function() {
				$("#yhgl-add").show();
			});
			
			// 隐藏新增用户弹框
			$(".cancel").bind("click", function() {
				$("#yhgl-add").hide();
			});
			
			// 新增用户
			$(".confirm").bind("click", function() {
				var xm = $("#dialog-xm").val();
				var zh = $("#dialog-zh").val();
				var zw = $("#dialog-zw").val();
				var bm = $("#dialog-bm").val();
				if (zw == 0) {
					alert("请选择职位");
					return;
				}
				if (bm == 0) {
					alert("请选择部门");
					return;
				}
				var param = {
					xm: xm,
					zh: zh,
					zw: zw,
					bm: bm
				};
				$.ajax({
					url: path + "/evaluation/yhgl/insertUser",
					type: "POST",
					dataType: "json",
					data: JSON.stringify(param),
					contentType: "application/json",
					success: function(data) {
						if (data) {
							$("#yhgl-add").hide();
							search(true);
							// 清空弹出框中的填写内容
							$("#dialog-xm").val("");
							$("#dialog-zh").val("");
							$("#dialog-zw").val("0");
							$("#dialog-bm").val("0");
							$("#dialog-bz").val("");
						}
					}
				});
			});
		}
		
		// 初始化职位下拉框
		function initZwList() {
			var options = [{
				key: "请选择",
				value: ""
			},{
				key: "人事主管",
				value: "1"
			},{
				key: "软件工程师",
				value: "2"
			},{
				key: "运维",
				value: "3"
			},{
				key: "业务分析",
				value: "4"
			},{
				key: "行政总监",
				value: "5"
			}];
			ractive.set("options", options);
		}
		
		// 查询
		function search(flag) {
			var xm = ractive.get("xm");
			if (flag) {
				$("#zw").val("");
			}
			var zw = $("#zw").val();
			var param = {
				xm: xm,
				zw: zw
			};
			$.ajax({
				url: path + "/evaluation/yhgl/getUsers",
				type: "POST",
				dataType: "json",
				data: JSON.stringify(param),
				contentType: "application/json",
				success: function(data) {
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
					ractive.set("list", data);
					// 重置复选框
					$(".check").each(function(index, items) {
						$(this).attr("checked", false);
					});
				}
			});
		}
		
		// 更新
		function update(flag, param) {
			$.ajax({
				url: path + "/evaluation/yhgl/updateUser",
				type: "post",
				dataType: "json",
				data: JSON.stringify(param),
				contentType: "application/json",
				success: function(data) {
					if (data) {
						if (flag) {
							search(true);
						} else {
							alert("重置成功");
						}
					}
				}
			});
		}
		
		// 模板中事件绑定
		ractive.on({
			search: function() {
				search();
			},
			batchRemove: function() {
				var checkArray = $(".check:checked");
				if (checkArray.length == 0) {
					alert("请至少选择一个用户");
					return;
				}
				var array = [];
				for (var i = 0; i < checkArray.length; i++) {
					array.push(checkArray[i].value);
				}
				if (confirm("确认删除？")) {
					var param = {
						flag: "d",
						ids: array
					};
					update(true, param);
				}
			},
			remove: function(event) {
				if (confirm("确认删除？")) {
					$id = $(event.node).attr("arg");
					var checkArray = [];
					checkArray.push($id);
					var param = {
						flag: "d",
						ids: checkArray
					};
					update(true, param);
				}
			},
			resetPassWd: function(event) {
				if (confirm("确认重置密码？")) {
					$id = $(event.node).attr("arg");
					var array = [];
					array.push($id);
					var param = {
						flag: "r",
						ids: array
					};
					update(false, param);
				}
			}
		});
	});
});