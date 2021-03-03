import {AngularVersion} from './models/AngularVersion'

const getList = async () : Promise<AngularVersion | null> =>{
    const promiseObj = new Promise<AngularVersion | null>((resolve, reject) => {
        const xHttp = new XMLHttpRequest();
        xHttp.onload = function() {
            if (this.status == 200) {
                resolve(xHttp.response);
            } else {
                reject(null);
            }
        };
        xHttp.open("GET", 'https://api.github.com/search/repositories?q=angular');
        xHttp.send();
    });
    return promiseObj;
};
const A1 = 2;
const A2= getList().then(function (res) {
    const A3 = 2;
    const A4 = 2;
}).catch();



