const images = [
    "https://www.menucool.com/slider/ninja-slider/img/abc.jpg",
    "https://www.sliderrevolution.com/wp-content/uploads/2023/07/automatic-slideshow.jpg",
    "https://www.pixelbyhand.com/wp-content/uploads/2023/01/website-blog-image-size.jpg"
];
let currentIndex = 0;
        const slider = document.getElementById("slider");

        function updateImage() {
            slider.src = images[currentIndex];
        }
        
        function nextImage() {
            currentIndex = (currentIndex + 1) % images.length;
            updateImage();
        }
        
        function prevImage() {
            currentIndex = (currentIndex - 1 + images.length) % images.length;
            updateImage();
        }
        
        updateImage();