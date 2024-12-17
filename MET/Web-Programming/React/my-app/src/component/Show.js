import React, { useEffect ,useState} from 'react'

function Show  () {

    var [data, setData] =useState([]);

    useEffect(()=>{
        fetch('http://localhost:5224/api/home/dept')
        .then(res=>res.json())
        .then(val=>{
            console.log(val);
            setData(val);
        })
    },[]);
  return (
    <div className='container'>
    <h1>SHOW DATA FROM API</h1>
    <table className="table">
        <tr>
            <th>employeeId</th>
            <th>employeeName</th>
        </tr>
        {
            data.map((number) =>
            <tr>
                <td>{number.id}</td>
                <td>{number.deptName}</td>
            </tr>
            )
        }
        </table>
    </div>
  )
}

export default Show