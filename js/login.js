/**
 * Created by SUN on 2016/4/27.
 */
// 登陆
function login() {
    var user_zh = $('#zh').val();
    var mm = $('#mm').val();
    console.log("login_1");
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
    window.location.href = "../html/kp.html";
    console.log("login_2");

}
