import { Image, Layout, Menu } from "antd";
import React, { useState } from 'react';
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
                <Menu theme="dark" mode="horizontal">
                    <Menu.Item key="1">Todos os Livros</Menu.Item>
                    <Menu.Item key="2">Melhores Livros</Menu.Item>
                    <Menu.Item key="3">Meus Livros</Menu.Item>
                </Menu>
            </Header>
            <Layout>
                <Content style={{ padding: '0 50px' }}>   
                    <div style={{background: '#fff',
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