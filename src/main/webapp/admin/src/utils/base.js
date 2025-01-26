const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmji1s8/",
            name: "ssmji1s8",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmji1s8/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "面向tcp/ip与网络互联实验平台"
        } 
    }
}
export default base
