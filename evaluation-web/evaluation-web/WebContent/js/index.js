$(document).ready(function() {
	checkLogin(function () {
		
		var path = getRootPath();
		
		// 登出
		$(".logout").bind("click", function() {
			$.ajax({
				url: path + "/evaluation/logout",
				type: "GET",
				dataType: "json",
				contentType: "application/json",
				success: function(data) {
					if (data) {
						location.href = "login.html";
					}
				}
			});
		});
	});
});