import React from 'react'

function Product(props) {
  console.log(props);
//   function myFunc(){
//     props.price =9000;
//   }

  return (
    <div>
        <h2 className='text-center'>{props.price}</h2>
        <p>{props.name}</p>
        <p>
            <button>Add to Cart</button>
        </p>
    </div>
  )
}
export default Product;
