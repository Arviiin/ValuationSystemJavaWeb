/**
 * Created by Administrator on 2016/4/29.
 */
function showDiv(){
    var div = document.getElementById('sel');
    div.style.visibility = "visible";
}
function hideDiv(){
    var div = document.getElementById('sel');
    div.style.visibility="hidden";
}
function getValue(targetObj,sourceObj){
    document.getElementById(targetObj).value = sourceObj;
    hideDiv();
}
function jrsh(){
    window.location.href="kp.html";
}