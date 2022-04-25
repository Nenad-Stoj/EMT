import React from 'react';
import {useNavigate} from 'react-router-dom';


const BookAdd = (props) =>{

    const navigate = useNavigate();
    const [formData, updateFormData] = React.useState({
        name: "",
        category: 1,
        author: 1,
        Copies: 1
    })

    const onFormSubmit = (e) => {
        e.preventDefault();
        const name = formData.name;
        const Copies = parseInt(formData.Copies);
        const category = formData.category;
        const authorId = formData.author;
        props.onAddBook(name, category, authorId, Copies);
        navigate.push("/books");
    }
    const handleChange = (e) => {
        updateFormData({
            ...formData,
            [e.target.name]: e.target.value.trim()
        })
    }


    return(
        
                <form onSubmit={onFormSubmit}>
                    <div className="form-group">
                        <label htmlFor="name">Book name</label>
                        <input type="text"
                               className="form-control"
                               id="name"
                               name="name"
                               required
                               placeholder="Book name"
                               onChange={handleChange}
                        />
                    </div>
                    <div className="form-group">
                        <label htmlFor="name">Book Category</label>
                        <input type="text"
                               className="form-control"
                               id="category"
                               name="category"
                               placeholder="Book category"
                               onChange={handleChange}
                        />
                    </div>
                    <div className="form-group">
                        <label htmlFor="name">Number of copies</label>
                        <input type="text"
                               className="form-control"
                               id="numCopies"
                               name="numCopies"
                               placeholder="Number of copies"
                               onChange={handleChange}
                        />
                    </div>
                    <div className="form-group">
                        <select name="author" className="form-control" onChange={handleChange}>
                            {props.authors.map((term) =>
                                <option value={term.id}>{term.name}</option>
                            )}
                        </select>
                    </div>
                    <button id="submit" type="submit" className="btn btn-primary">Submit</button>
                </form>
    )
}

export default BookAdd;

