import React from "react";
import { BrowserRouter, Route, Switch } from "react-router-dom";

import Home from './Home';

const Routes = () => (
    <BrowserRouter>
        <Switch>
          <Route path="/about">
            <Home />
          </Route>
          <Route path="/users">
            <Home />
          </Route>
          <Route path="/">
            <Home />
          </Route>
        </Switch>
    </BrowserRouter>
)

export default Routes;