import logo from './logo.svg';
import './App.css';

import Navbar from './component/Navbar';
import Textform from './component/Textform';
import About from './component/about';
  

function App() {
  return (
    <>
    <Navbar/>
        <div className="container  my-5">
     <Textform heading="Enter the text analyze"/> 
     <About/>    
     </div>          
    </>
);
}
  
export default App;

 