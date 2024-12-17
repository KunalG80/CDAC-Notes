import React, { Component } from 'react'
import axios from 'axios';
export default class Class2 extends Component {
    constructor(){
        super();
        this.x1 = React.createRef();
        this.x2 = React.createRef();
        // this.x3 = React.createRef();
    }
    myfunc(){
        var name = this.x1.current.value
        console.log(name);
        var age = this.x2.current.value
        // var path = this.x3.current.value

        axios.post(
            "http://localhost:9000/users",
            {name : name ,age:age}
        ).then(res=>{
            console.log(res);
        })
    }
  render() {
    return (
      <div className='container'>
        <h1>Add Record</h1>
        <input ref={this.x1}/> <br />
        <input ref={this.x2}/> <br />
        {/* <input ref={this.x3}/> <br /> */}
        <button onClick={()=>{this.myfunc()}}>Record</button>
      </div>
    )
  }
}
