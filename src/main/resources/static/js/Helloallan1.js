HelloAllan = function () {
    alert("Hello Allan!");
}

getEnvUrl = function () {
    $.ajax({
        type: "get",
        url: "getEnvUrl",
        success: function (data)
        {
            alert(data);
        },
        error:function (XMLHttpRequest, textStatus, errorThrown) {
            alert("����ʧ�ܣ�");
        }
    });
}