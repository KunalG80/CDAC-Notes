import React, { useRef, useState } from 'react'
import Comp2 from './Comp2'

export default function Comp1() {
  var x1 = useRef();
  var[country,setcountry] = useState("");
  function myfunc(){
  console.log(x1.current.value);
  setcountry(x1.current.value)
  }
  return (
    <div className='container border border-5 border-danger'>
        <h1>Search</h1>
        <input type='text'/>
        <button>Search</button>
        <hr />
        <Comp2 p1={country}/>
    </div>
  )
}
