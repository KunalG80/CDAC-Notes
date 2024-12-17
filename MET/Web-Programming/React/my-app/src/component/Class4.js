import React, { Component } from 'react'
import axios from 'axios';

export default class Class4 extends Component {
  constructor(){
    super();
    this.state ={
        apidata:[]
    }
  }

    componentDidMount(){
        axios.get('http://localhost:9000/users2')
        .then(res=>{
            console.log(res.data);
            this.setState({
                apidata:res.data
            });
        })
    }
    render() {
        var result = this.state.apidata
    return (
      <div className='conatiner'>
        <h1>Show Data from db</h1>
        <hr />
        <div className='row'>
            {
                result && result.map((obj)=>
                <div className='col-3 text-center'>
                    <h2>{obj.name}</h2>
                    <p>{obj.age}</p>
                </div>)
            }
        </div>
      </div>
    )
  }
}
