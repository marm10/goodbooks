import { Col, Descriptions, Image, Modal, Row } from "antd";
import axios from "axios";
import React, { useEffect, useState } from "react";

function ModalBookDetails({bookId, showModal, onOk}) {
    const [book, setBook] = useState({});
    useEffect(() => {
        axios.get(`http://localhost:8080/api/books/${bookId}`, {
            headers: {
                'Access-Control-Allow-Origin': '*',
            },
        }).then(r => {
            setBook(r.data)
        })
    }, [bookId])

    return (
        <Modal width={900} onCancel={onOk} onOk={onOk} visible={showModal} >
            <Row gutter={24}>
                <img style={{height: 300}} alt={book.title} src={book.imageLink} />
                <Descriptions title={"Info"} column={1} style={{display: 'inline-block'}}>
                    <Descriptions.Item label={"Título"}>{book.title}</Descriptions.Item>
                    <Descriptions.Item label={"Sub-título"}>{book.subtitle}</Descriptions.Item>
                    <Descriptions.Item label={"Autor"}>{book.author}</Descriptions.Item>
                    <Descriptions.Item label={"Resumo"}>{book.description}</Descriptions.Item>
                </Descriptions>
            </Row>
        </Modal>
    );
}

export default ModalBookDetails;