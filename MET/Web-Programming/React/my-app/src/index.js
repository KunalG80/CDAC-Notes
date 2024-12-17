import React from 'react';
import ReactDOM from 'react-dom/client';
import App from './component/App';
import './style.css'

import {
    createBrowserRouter,
    RouterProvider,
  } from "react-router-dom";
import Home from './component/Home';
import Login from './component/Login';
import Register from './component/Register';
import Show from './component/Show';
import Add from './component/Add';
import Class1 from './component/Class1';
import Class2 from './component/Class2';
import ShowData from './component/ShowData'
import Class4 from './component/Class4';
import Comp1 from './component/Comp1';

  const projectRoute=createBrowserRouter([
    {
        path:"/",
        element:<App></App>,
        children:[
            {path:'',element:<Home></Home>},
            {path:'login',element:<Login></Login>},
            {path:'register',element:<Register></Register>},
            {path:'show',element:<Show></Show>},
            {path:'add',element:<Add></Add>},
            //{path:'*',element:<Page Not Found />},
            {path:"class1",element:<Class1 name = "user1" age ="20" place = "Mumbai"/>},
            {path : "class2",element:<Class2/>},
            {path : 'showdata',element:<ShowData/>},
            {path : 'class4',element:<Class4></Class4>},
            {path : 'comp1',element:<Comp1></Comp1>}
            
        ]
    }
  ])

// console.log(React);
// console.log(ReactDOM);

const ans = ReactDOM.createRoot(document.getElementById('root'));
ans.render(<RouterProvider router = {projectRoute}/>)