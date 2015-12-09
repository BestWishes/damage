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
		$("#shuxin1").textbox('setValue',$("#oldshuxin1").textbox('getValue'));
		$("#fujia1").textbox('setValue',$("#oldfujia1").textbox('getValue'));
		$("#zengjia1").textbox('setValue',$("#oldzengjia1").textbox('getValue'));
		$("#baoji1").textbox('setValue',$("#oldbaoji1").textbox('getValue'));
		$("#baojilv1").textbox('setValue',$("#oldbaojilv1").textbox('getValue'));
		$("#kangxing1").textbox('setValue',$("#oldkangxing1").textbox('getValue'));
		$("#jianshang1").textbox('setValue',$("#oldjianshang1").textbox('getValue'));
	})
	$("#ld").click(function(){
		
		$("#oldpower").textbox('setValue',$("#power").textbox('getValue'));
		$("#oldduli").textbox('setValue',$("#duli").textbox('getValue'));
		$("#oldshuxin1").textbox('setValue',$("#shuxin1").textbox('getValue'));
		$("#oldfujia1").textbox('setValue',$("#fujia1").textbox('getValue'));
		$("#oldzengjia1").textbox('setValue',$("#zengjia1").textbox('getValue'));
		$("#oldbaoji1").textbox('setValue',$("#baoji1").textbox('getValue'));
		$("#oldbaojilv1").textbox('setValue',$("#baojilv1").textbox('getValue'));
		$("#oldkangxing1").textbox('setValue',$("#kangxing1").textbox('getValue'));
		$("#oldjianshang1").textbox('setValue',$("#jianshang1").textbox('getValue'));
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