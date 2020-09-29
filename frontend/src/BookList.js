import React from 'react';
import { Form, Row, Image, Card, Descriptions } from 'antd';
import axios from "axios"
import DescriptionsItem from 'antd/lib/descriptions/Item';

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
            this.setState({entities: r.data})
        })
    }
    

    render() {
        return (
            <Row>
                {
                    this.state.entities.map((e, i) => {
                    return <Card title={e.title}><Image src={e.imageLink} /></Card>
                    })
                }
            </Row>
        )
    }
}

export default BookList;