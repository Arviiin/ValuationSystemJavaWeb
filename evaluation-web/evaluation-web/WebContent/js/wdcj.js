$(document).ready(function() {
	
	// 用户登录校验
	checkLogin(function() {
		
		var path = getRootPath();
		// 模板初始化
		var ractive = new Ractive({
			el: ".content",
			template: "#template",
			oncomplete: function() {
				
				// 获取本月成绩
				getCurrentScore();
				
				// 根据年度加载成绩列表
				var year = new Date().getFullYear();
				var param = {
					khnd: year
				};
				getList(param);
			}
		});
		
		// 获取本月成绩
		function getCurrentScore() {
			$.ajax({
				url: path + "/evaluation/wdcj/getCurrentScore",
				type: "GET",
				dataType: "json",
				contentType: "application/json",
				success: function(data) {
					ractive.set("currentScore", data);
				}
			});
		}
		
		// 根据年度加载成绩列表
		function getList(param) {
			$.ajax({
				url: path + "/evaluation/wdcj/getScoreByYear",
				type: "POST",
				dataType: "json",
				data: JSON.stringify(param),
				contentType: "application/json",
				success: function(data) {
					ractive.set("list", data);
					ractive.set("year", param.khnd);
				}
			});
		}
		
		// 模板中事件绑定
		ractive.on({
			toCurrentDetail: function() {
				var date = new Date();
				var year = date.getFullYear();
				var month = date.getMonth() + 1;
				location.href = "cjxq.html?khnd=" + year + "&khyf=" + month;
			},
			toDetail: function(event) {
				$khnd = $(event.node).attr("khnd");
				$khyf = $(event.node).attr("khyf");
				location.href = "cjxq.html?khnd=" + $khnd + "&khyf=" + $khyf;
			},
			preYear: function() {
				var year = parseInt(ractive.get("year")) - 1;
				var param = {
					khnd: year
				};
				getList(param);
			},
			nextYear: function() {
				var year = parseInt(ractive.get("year")) + 1;
				var param = {
					khnd: year
				};
				getList(param);
			},
			back: function() {
				location.href = "index.html";
			}
		});
	});
});