<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>登录 | SpringForAll - Spring Security</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.css" rel="stylesheet">
</head>

<body style="background-color: #f1f1f1; padding-bottom: 0">
<#include "../layout/header.ftl">

<div id="fh5co-wrapper">
    <div id="fh5co-page">
        <#include "../layout/guide.ftl">
        <div class="container" style="margin-top: 60px">
            <div style="text-align: center; margin-top: 10%">
                <img src="http://upload.jianshu.io/users/upload_avatars/3424642/fb55f16faaf6.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/240/h/240"
                     alt="avatar" class="img-circle" style="margin: 0 auto">
                <p style="margin-top: 25px; font-size: 20; color: crimson">${username}</p>
                <form action="/logout.htm" method="post">
                    <button class="btn btn-danger" style="margin-top: 20px">退出登录</button>
                </form>
            </div>
        </div>
        <#include "../layout/footer.ftl">
    </div>
</div>
<#include "../layout/js.ftl">
</body>

</html>
