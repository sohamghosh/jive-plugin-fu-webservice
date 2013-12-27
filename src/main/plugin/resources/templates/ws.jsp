<html>
<head>
    <script>
        $j(document).ready(function () {
            $j("button").click(function () {
                $j.ajax({
                    url: "/api/fu/submit",
                    type: 'POST',
                    dataType: 'json',
                    contentType: 'application/json',
                    data: "{'name': 'Soham', 'city': 'Bangalore'}",
                    success: function (result) {
                        alert("success");
                    },
                    error: function (result) {
                        alert("error");
                    }
                });
            });
        });
    </script>
</head>
<body>
<button>Send an HTTP POST</button>
</body>
</html>