import { Image, Row, Col, Card } from 'antd';
import axios from "axios";
import React from 'react';

class BookList extends React.Component {
    state = {
        entities: [],
        totalCount: 0,
    }

    componentDidMount() {
        axios.get("http://localhost:8080/api/books/", {
            headers: {
                'Access-Control-Allow-Origin': '*',
            },
        }).then(r => {
            this.setState({ entities: r.data })
        })
    }


    render() {
        const {Meta} = Card;
        return (
            <Row gutter={24}>
                {
                    this.state.entities.map((e, i) => {
                        return (
                            <Col key={e.id} span={4} style={{padding: 20}}>
                                <Card hoverable
                                onClick={() => {
                                    this.props.onBookClick(e.id)
                                }}
                                bodyStyle={{height: 120}}
                                cover={<img style={{height: 200}} alt={e.title} src={e.imageLink} />}>
                                    <Meta title={e.title} description={e.subtitle} />
                                </Card>
                            </Col>
                        )
                    })
                }
            </Row>
        )
    }
}

export default BookList;