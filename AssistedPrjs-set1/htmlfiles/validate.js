function store(){

    var name = document.getElementById('name');
    var pw = document.getElementById('pw');

    if(name.value.length == 0){
        alert('Please fill in email');

    }else if(pw.value.length == 0){
        alert('Please fill in password');

    }else if(name.value.length == 0 && pw.value.length == 0){
        alert('Please fill in email and password');

    }else{
        localStorage.setItem('name', name.value);
        localStorage.setItem('pw', pw.value);
        alert('Your account has registered!!!');
    }
}

//checking
function check(){
    var storedName = localStorage.getItem('name');
    var storedPw = localStorage.getItem('pw');

    var userName = document.getElementById('n1');
    var userPw = document.getElementById('n2');
    

    if(userName.value == storedName && userPw.value == storedPw){
       window.alert('You are successfully logged in');
    }else if(userName.value=="sai@gmail.com" && userPw.value=="123"){
        alert("successfully login")
    }
    else if(n1.value.length==0){
        alert('Please fill in email!!!');
    }
    else if(n2.value.length==0){
        alert('Please fill in password!!!');
    }
    else if(name.value.length == 0 && pw.value.length == 0){
    alert('Please fill in email and password!!!');

    }
    else{
        alert('Error on login!!! Account does not exist please register first');
     
    }
}