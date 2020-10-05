import React from 'react';
import BookList from './BookList';
import {Menu, Row, Col, Table} from "antd";
import Home from './Home';

function App() {
  const columns = [
    {
      title: 'Name',
      dataIndex: 'name',
      key: 'name',
    },
    {
      title: 'Email',
      dataIndex: 'email',
      key: 'email',
    },
    {
      title: 'Address',
      dataIndex: 'address',
      key: 'address',
    },
  ];


  return (
    <div className="container">
        <Home />
    </div>
  );
}

export default App;
