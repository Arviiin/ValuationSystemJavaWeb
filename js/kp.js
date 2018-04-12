/**
 * Created by sun on 2016/4/28.
 */
function syx(){
    var a =$("div .kpxx").find(":visible").parent();//div
    var id =$("div .kpxx").find(":visible").parent().attr("id");//id
    /*console.log(a.next().find("div"));*/
    if(id == "num_1"){
    }else{
        a.css('display','none');
        a.prev().css('display','block');
    }
}
function xyx(){
    var a =$("div .kpxx").find(":visible").parent();
    var id =$("div .kpxx").find(":visible").parent().attr("id");
    /* console.log(a.next().find("div"));*/
    if(id == "num_9"){
    }else{
        a.css('display','none');
        a.next().css('display','block');
    }
}
