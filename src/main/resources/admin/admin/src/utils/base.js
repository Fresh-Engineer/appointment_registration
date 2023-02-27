const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootweb/",
            name: "springbootweb",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootweb/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "预约挂号系统"
        } 
    }
}
export default base
