import React, { useRef } from 'react'
// import { json } from 'react-router-dom';

function Login  () {

    var x1 = useRef();
    var x2 = useRef();
    var x3 = useRef();
    function loginFunction(){
        var email = x1.current.value;
        var pass = x2.current.value;
        fetch('http://localhost:5224/api/home/dept/add',{
        method :'POST',
        body: JSON.stringify({Id:email,DeptName:pass}),
        headers:{
            'Content-Type':'application/json'
        }
        })
        .then(res=>{
            console.log(res);
        })
    }
  return (
    <div className='container'>
        <h1>Login Form</h1>
        <input type='test' ref={x1}></input><br />
        <input type='password' ref={x2}></input><br />
        <button onClick={loginFunction}>Login</button>
        <p ref={x3}></p>
    </div>
  )
}

export default Login;