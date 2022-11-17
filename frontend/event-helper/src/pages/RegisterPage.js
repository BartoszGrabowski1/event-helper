import RegistrationForm from "../components/RegistrationForm"
import React, {useState} from "react";
import Navbar from "../components/Navbar";
import ForgotPasswordForm from "../components/ForgotPasswordForm";

export default function RegisterPage() {      // TODO IN PROGRESS

    const userData = {
        name: "name",
        age: "age",
        email: "email",
        password: "password"
    }

    const [user, setUser] = useState({name: ""});
    const [error, setError] = useState("");

    const Login = register => {
        if (register.name === userData.name && register.password === userData.password) {
            setUser({
                name: register.name,
            });
        } else {
            setError("Details do not match!")
        }
    }

    const Logout = () => {
        setUser({name: ""});
    }


    return (
        <div>
            <Navbar/>
            {(user.name !== "") ? (
                <div className="welcome">
                    <h2>Welcome, <span>{user.name}</span></h2>
                    <button onClick={Logout}>Logout</button>
                </div>
            ) : (
                <RegistrationForm Login={Login} error={error} />
            )}
            <ForgotPasswordForm/>
        </div>
    )

}