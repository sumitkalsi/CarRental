
 const element = document.getElementById("container");
   
    const nav = document.getElementById("nav");

window.addEventListener("scroll",()=> {
    const scrollTop = window.scrollX || document.documentElement.scrollTop;
    element.style.bottom = scrollTop*0.3+"px";
      
   if (scrollY>=400) {
       nav.style.position="fixed"
       
      
       
   }else{
    nav.style.position="absolute"
   }
     
})

	function alert(){
   console.log("alert")
}
