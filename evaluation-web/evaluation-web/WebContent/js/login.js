/**
 * Created by SUN on 2016/4/27.
 */
// 登陆
function login() {
    var user_zh = $('#zh').val();
    var mm = $('#mm').val();
// 验证
    var reg = /^\w{3,20}$/;
    if (!reg.test(user_zh)) {
        alert("请输入3～20位用户名");
        return;
    }

    if (mm.length < 6) {
        alert("密码长度不能小于6位");
        return;
    }
    var param = {
    	zh: user_zh,
    	mm: mm
    }
    
    var path = getRootPath();
    
    $.ajax({
    	url: path + "/evaluation/login",
    	type: "post",
    	dataType: "json",
    	data: JSON.stringify(param),
    	contentType: "application/json",
    	success: function(data) {
    		if (data) {
    			window.location.href = "index.html";
    		}
    	}
    });
}
