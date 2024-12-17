import React from 'react'
import Product from './Product';

function Home()  {
  return (
    <div className='container'>
        <div className='row'>
            <div className='col-xl-3'>
                <Product name ="jeans" price ="1000"></Product>
            </div>
            <div className='col-xl-3'>
                <Product name ="shirt" price ="2000"></Product>
            </div>
            <div className='col-xl-3'>
                <Product name ="Tshirt" price ="3000"></Product>
            </div>
            <div className='col-xl-3'>
                <Product name ="belt" price ="4000"></Product>
            </div>

        </div>
    </div>
  )
}
 export default Home;
 