$(document).ready(function() {
	$("#duliform").hide();

	$("#zhiyexuanzhe").combobox({
		onSelect : function() {
			if ($("#zhiyexuanzhe").combobox("getValue") == "baifenbizhiye") {
				$("#duliform").hide();
				$("#baifenbiform").show();
			} else if ($("#zhiyexuanzhe").combobox("getValue") == "dulizhiye") {
				$("#duliform").show();
				$("#baifenbiform").hide();
			}
		}
	});

	$("#duliform").form({
		onSubmit:function(param){
			param.zhiye=$("#zhiyexuanzhe").combobox("getValue");
			return $("#duliform").form('validate');
		},
		success : function(data) {
			$("#result1").val(data);
		}
	})
	$("#baifenbiform").form({
		onSubmit:function(param){
			param.zhiye=$("#zhiyexuanzhe").combobox("getValue");
			return $("#baifenbiform").form('validate');
		},
		
		success : function(data) {
			$("#result").val(data);
		}
	})
	
	$("#rd").click(function(){
		
		$("#power").textbox('setValue',$("#oldpower").textbox('getValue'));
		$("#duli").textbox('setValue',$("#oldduli").textbox('getValue'));
		$("#shuxin").textbox('setValue',$("#oldshuxin").textbox('getValue'));
		$("#fujia").textbox('setValue',$("#oldfujia").textbox('getValue'));
		$("#zengjia").textbox('setValue',$("#oldzengjia").textbox('getValue'));
		$("#baoji").textbox('setValue',$("#oldbaoji").textbox('getValue'));
		$("#baojilv").textbox('setValue',$("#oldbaojilv").textbox('getValue'));
		$("#kangxing").textbox('setValue',$("#oldkangxing").textbox('getValue'));
		$("#jianshang").textbox('setValue',$("#oldjianshang").textbox('getValue'));
	})
	$("#ld").click(function(){
		
		$("#oldpower").textbox('setValue',$("#power").textbox('getValue'));
		$("#oldduli").textbox('setValue',$("#duli").textbox('getValue'));
		$("#oldshuxin").textbox('setValue',$("#shuxin").textbox('getValue'));
		$("#oldfujia").textbox('setValue',$("#fujia").textbox('getValue'));
		$("#oldzengjia").textbox('setValue',$("#zengjia").textbox('getValue'));
		$("#oldbaoji").textbox('setValue',$("#baoji").textbox('getValue'));
		$("#oldbaojilv").textbox('setValue',$("#baojilv").textbox('getValue'));
		$("#oldkangxing").textbox('setValue',$("#kangxing").textbox('getValue'));
		$("#oldjianshang").textbox('setValue',$("#jianshang").textbox('getValue'));
	})
	
	$("#rb").click(function(){
		
		$("#gongji").textbox('setValue',$("#oldgongji").textbox('getValue'));
		$("#wushi").textbox('setValue',$("#oldwushi").textbox('getValue'));
		$("#shuxin").textbox('setValue',$("#oldshuxin").textbox('getValue'));
		$("#fujia").textbox('setValue',$("#oldfujia").textbox('getValue'));
		$("#zengjia").textbox('setValue',$("#oldzengjia").textbox('getValue'));
		$("#baoji").textbox('setValue',$("#oldbaoji").textbox('getValue'));
		$("#baojilv").textbox('setValue',$("#oldbaojilv").textbox('getValue'));
		$("#kangxing").textbox('setValue',$("#oldkangxing").textbox('getValue'));
		$("#jianshang").textbox('setValue',$("#oldjianshang").textbox('getValue'));
	})
	$("#lb").click(function(){
		
		$("#oldgongji").textbox('setValue',$("#gongji").textbox('getValue'));
		$("#oldwushi").textbox('setValue',$("#wushi").textbox('getValue'));
		$("#oldshuxin").textbox('setValue',$("#shuxin").textbox('getValue'));
		$("#oldfujia").textbox('setValue',$("#fujia").textbox('getValue'));
		$("#oldzengjia").textbox('setValue',$("#zengjia").textbox('getValue'));
		$("#oldbaoji").textbox('setValue',$("#baoji").textbox('getValue'));
		$("#oldbaojilv").textbox('setValue',$("#baojilv").textbox('getValue'));
		$("#oldkangxing").textbox('setValue',$("#kangxing").textbox('getValue'));
		$("#oldjianshang").textbox('setValue',$("#jianshang").textbox('getValue'));
	})
	
	
	
})