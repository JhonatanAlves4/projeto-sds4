import Dashboard from 'pages/DashBoard';
import Home from 'pages/Home';
import { BrowserRouter, Switch, Route } from 'react-router-dom';

const Routes = () => {
    return(
        <BrowserRouter>
        <Switch>
            <Route exact path="/" component={Home}/>
            <Route path="/dashboard" component={Dashboard}/>
        </Switch>
        </BrowserRouter>
    );
}

export default Routes;