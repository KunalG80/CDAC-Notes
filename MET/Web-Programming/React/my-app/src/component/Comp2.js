import React from 'react'
import Left from './Left'
import Right from './Right'

export default function Comp2() {
  return (
    <div className='p-3 border border-3 border-success'>
        <div className='row'>
            <div className='col-3 border p-3 border-4'>
                <Left />
            </div>
            <div className='col-9 border p-3 border-4'>
                <Right></Right>
            </div>
        </div>
    </div>
  )
}