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
		},
		success : function(data) {
			$("#result1").val(data);
		}
	})
	$("#baifenbiform").form({
		onSubmit:function(param){
			param.zhiye=$("#zhiyexuanzhe").combobox("getValue");
		},
		success : function(data) {
			$("#result").val(data);
		}
	})
})