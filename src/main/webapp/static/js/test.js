window.onload=function () {
	console.log("���Կ�ʼ��");
	login("13660208544");//��¼����
}
function login (phone) {
	$.post("../login/login",
        {"phone_number":phone, "password":123456},
        function(data) {
            console.log(data);
            }
        )
}