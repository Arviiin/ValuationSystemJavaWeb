$(document).ready(function() {
	
	// 用户登录校验
	checkLogin(function() {
		var khnd = getParamByUrl("khnd");
		var khyf = getParamByUrl("khyf");
		var path = getRootPath();
		// 模板初始化
		var ractive = new Ractive({
			el: ".content",
			template: "#template",
			oncomplete: function() {
				
				// 获取成绩详情
				getScoreDetail();
			}
		});
		
		// 获取成绩详情
		function getScoreDetail() {
			var param = {
				khnd: khnd,
				khyf: khyf
			}
			$.ajax({
				url: path + "/evaluation/wdcj/getScoreDetail",
				type: "POST",
				dataType: "json",
				data: JSON.stringify(param),
				contentType: "application/json",
				success: function(data) {
					ractive.set("list", data);
					ractive.set("khnd", khnd);
					ractive.set("khyf", khyf);
				}
			});
		}
		
		// 模板中事件绑定
		ractive.on({
			back: function() {
				location.href = "wdcj.html";
			}
		});
	});
});