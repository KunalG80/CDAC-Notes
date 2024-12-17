import React, { useState } from 'react'

function Register  ()  {

    var[count, setCount] = useState(100);
    function myFunc(){
        setCount(count+10);
    }
  return (
    <div>
        <h1>State Variable</h1>
        <br />,
        {count}
        <button onClick={myFunc}>Click me</button>
    </div>
  )
}

export default Register