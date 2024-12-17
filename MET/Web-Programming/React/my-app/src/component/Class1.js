import React, { Component } from 'react'

export default class Class1 extends Component {
    // constructor(){
    //     super();
    //     console.log("class1 constructor");
    //     console.log(this);
    // }
    myfunc(){
        this.props.name = 'user2'
    }
  render() {
    console.log('Mounted');
    return (
      <div className='container'>
        <h1>Props</h1>
        <p>
            {this.props.name}
            {this.props.age}
            {this.props.place}
        </p>
        <button onClick={()=>{this.myfunc()}}>Enter</button>
        </div>
    )
  }
}
