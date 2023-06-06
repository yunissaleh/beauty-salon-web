    var btns = document.getElementById('btns');
    function acceptEmailTo(appointmentEmail, id) {
    // Initialize EmailJS with your user ID
    emailjs.init("KEZmbLVbVGSs87GXj");

    // Prepare the email parameters
    var params = {
    to_email: appointmentEmail,
    subject: "Appointment Accepted",
    message: "Your appointment has been accepted."
    };

    // Send the email
    emailjs.send("service_uwfw8pg", "template_zffasod", params)
    .then(function(response) {
    console.log("Email sent successfully!", response);
    hideButtons(id)
    }, function(error) {
        alert("Email sending failed:" + error)

    }


    );

    //mark as accepted
        fetch(`/api/${id}`)


    }

    function rejectEmailTo(appointmentEmail,id) {
    // Initialize EmailJS with your user ID
    emailjs.init("KEZmbLVbVGSs87GXj");

    // Prepare the email parameters
    var params = {
    to_email: appointmentEmail,
    subject: "Appointment Rejected",
    message: "Your appointment has been rejected."
};

    // Send the email
    emailjs.send("service_uwfw8pg", "template_zffasod", params)
    .then(function(response) {
    console.log("Email sent successfully!", response);
    hideButtons(id)
    }, function(error) {
    alert("Email sending failed:" + error)
});
}

function hideButtons(id) {
        document.getElementById(id).style.display= 'none';}
