import React, { Component } from 'react'

export default class Class3 extends Component {
    constructor(){
        super();
        console.log(this);
        this.state ={
            count:0
        }
    }
    myfunc(){
        this.setState({
            count:this.state.count + 10
        });
    }
    componentDidMount(){
        console.log('componentDidMount called', this.state.count);
    }

    componentDidUpdate(){
        console.log('componentDidUpdate called', this.state.count);
    }

    componentWillUnmount(){
        console.log('componentDidUnmount called', this.state.count);
    }
  render() {
    return (
      <div>Class3 , {this.state.count}
        <button onClick={()=>{this.myfunc()}}>Enter</button>
      </div>
    )
  }
}