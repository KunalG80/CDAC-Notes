import React from 'react'
import { Link } from 'react-router-dom';

function Header () {
  return (
    <nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">MET</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <Link class="nav-link active" aria-current="page" to="">Home</Link>
        </li>
        <li class="nav-item">
          <Link class="nav-link active" aria-current="page" to="login">Login</Link>
        </li>
        <li class="nav-item">
          <Link class="nav-link active" aria-current="page" to="register">Register</Link>
        </li>
        <li class="nav-item">
          <Link class="nav-link active" aria-current="page" to="add">Add</Link>
        </li>
        <li class="nav-item">
          <Link class="nav-link active" aria-current="page" to="show">Show</Link>
        </li>
        <li class="nav-item">
          <Link class="nav-link active" aria-current="page" to="class1">Class1</Link>
        </li>
        <li class="nav-item">
          <Link class="nav-link active" aria-current="page" to="class2">Class2</Link>
        </li>
        <li class="nav-item">
          <Link class="nav-link active" aria-current="page" to="class3">Class3</Link>
        </li>
        <li class="nav-item">
          <Link class="nav-link active" aria-current="page" to="showdata">ShowData</Link>
        </li>
        <li class="nav-item">
          <Link class="nav-link active" aria-current="page" to="class4">Class4</Link>
        </li>
        <li class="nav-item">
          <Link class="nav-link active" aria-current="page" to="comp1">Comp1</Link>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Dropdown
          </a>
          
        </li>
        <li class="nav-item">
          <a class="nav-link disabled" aria-disabled="true">Disabled</a>
        </li>
      </ul>
      <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search"/>
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>
  )
}

export default Header;

