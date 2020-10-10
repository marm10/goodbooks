import { Image, Layout, Menu } from "antd";
import React, { useState } from 'react';
import { Link, Router } from "react-router-dom";
import BookList from "./BookList";
import ModalBookDetails from "./ModalBookDetails";

function Home() {
    const {Header, Footer, Content} = Layout;
    const [book, setBook] = useState({});
    const [showModal, setShowModal] = useState(false);

    const onBookClick = (book) => {
        setBook(book);
        setShowModal(true);
    }

    const onOkModal = () => {
        setShowModal(false)
        setBook({});
    }

    return (
        
        <Layout>
            <Header>
            <div className="logo" style={{width: 200,
  height: 40,
  margin: '0px 24px 16px 0',
  float: 'left'}}>
      <Link to="/">
       <img height={40} src="https://dad-react-static.s3.us-east-2.amazonaws.com/untitled.png" /></Link></div>
                <Menu theme="dark" mode="horizontal">
                    <Menu.Item key="1"><Link to="/">Todos os Livros</Link></Menu.Item>
                    <Menu.Item key="2"><Link to="/">Melhores Livros</Link></Menu.Item>
                    <Menu.Item key="3"><Link to="/">Meus Livros</Link></Menu.Item>
                </Menu>
            </Header>
            <Layout>
                <Content style={{ padding: '0 50px' }}>   
                    <div style={{background: '#fffafa',
                                padding: '24px',
                                minHeight: '600px'}}>
                                    <BookList onBookClick={onBookClick} /></div>
                </Content>
            </Layout>
            <Footer style={{ textAlign: 'center' }}>Footer</Footer>
            <ModalBookDetails showModal={showModal} bookId={book} onOk={onOkModal} />
        </Layout>
    );
}

export default Home;