<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <!DOCTYPE=HTML>
        <html>
            <head>
                <title>This page send emails</title>

            </head>
    <body>

        Subject: <input type="text" id="subject"> <button id='send_button'>Send it</button> <br> 
        Text: <br> 
        <textarea id='email_body' rows="25" cols="50">
        At w3schools.com you will learn how to make a website. We offer free tutorials in all web development technologies.
        </textarea> <br>

        Addresses: <br>
        <textarea id="address_list" rows = '10' cols = '50'> </textarea>
    

        <br><br><br><br><br>
        <div id='text_container'> empty now </div>

    </body>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.js"></script>

        <script type="text/javascript">

            function button_clicked(){
                jmailtext=$('#email_body').val();
                jaddresses=$('#address_list').val();
                jsubject=$('#subject').val();
                // $("#text_container").html(temp_text);
                console.log('button is pressed! sending text to server');


                    $.ajax({
                        type: 'POST',
                        url: 'sent.htm',
                       data : {mailtext:jmailtext,
                                addresses:jaddresses,
                                subject:jsubject},
                        success: function (data) {
                                console.out('success');
                            },
                        error: function(xhr, textStatus, errorThrown) {
                           console.out("Please report this error: "+errorThrown+xhr.status+xhr.responseText);
                        },
                    });


                console.log('after ajax still');
            }

        </script>

        <script type="text/javascript"> 
        $(document).ready(function(){
            $('#send_button').on('click', button_clicked);
        });

        </script>
</html>