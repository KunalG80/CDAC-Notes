$(document).ready(function(){
    $("button").click(function(){
        var data1 = $("#x1").val();
        var data2 = $("#x2").val();
        var data3 = $("#x3").val();

        var pin =/^[1-9][0-9][0-9][0-9][0-9][0-9]$/;
        var mob =/^[1-9][0-9]{9}$/
        var pan = /^([a-zA-Z]{5})([0-9]{4})([a-zA-Z])$/

        var res1 = pin.test(data1);
        var res2 = mob.test(data2);
        var res3 = pan.test(data3);

        if(!res1){
            $("p").html('<b>Invalid pin</b>');
        }
        else if(!res2){
            $("p").html('<b>Invalid mobile</b>');
        }
        else if(!res3){
            $("p").html('<b>Invalid pan</b>');
        }
        else{
            $("p").html('<b>Valid</b>');
        }
    })
})