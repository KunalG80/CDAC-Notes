import React, { useEffect ,useState} from 'react'

function Show  () {

    var [data, setData] =useState([]);

    useEffect(()=>{
        fetch('http://localhost:9000/users2')
        .then(res=>res.json())
        .then(val=>{
            console.log(val);
            setData(val);
        })
    },[]);
  return (
    <div className='container'>
    <h1>SHOW DATA FROM Node</h1>
    <table className="table">
        <tr>
            <th>Name</th>
            <th>age</th>
        </tr>
        {
            data.map((number) =>
            <tr>
                <td>{number.name}</td>
                <td>{number.age}</td>
            </tr>
            )
        }
        </table>
    </div>
  )
}

export default Show