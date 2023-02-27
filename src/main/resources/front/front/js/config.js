
var projectName = '预约挂号系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
},
]


var indexNav = [

{
	name: '医生信息',
	url: './pages/yishengxinxi/list.html'
},
{
	name: '挂号记录',
	url: './pages/guahaojilu/list.html'
},
{
	name: '取消挂号',
	url: './pages/quxiaoguahao/list.html'
},
{
	name: '在线问诊',
	url: './pages/zaixianwenzhen/list.html'
},
{
	name: '评价与投诉',
	url: './pages/pingjiayutousu/list.html'
},

{
	name: '名医讲堂',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/springbootweb/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核"],"menu":"医生","menuJump":"列表","tableName":"yisheng"}],"menu":"医生管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核"],"menu":"机构","menuJump":"列表","tableName":"jigou"}],"menu":"机构管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"医院信息","menuJump":"列表","tableName":"yiyuanxinxi"}],"menu":"医院信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"科室分类","menuJump":"列表","tableName":"keshifenlei"}],"menu":"科室分类管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"科室信息","menuJump":"列表","tableName":"keshixinxi"}],"menu":"科室信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"医生信息","menuJump":"列表","tableName":"yishengxinxi"}],"menu":"医生信息管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核","添加至失信名单"],"menu":"挂号记录","menuJump":"列表","tableName":"guahaojilu"}],"menu":"挂号记录管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"取消挂号","menuJump":"列表","tableName":"quxiaoguahao"}],"menu":"取消挂号管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"失信名单","menuJump":"列表","tableName":"shixinmingdan"}],"menu":"失信名单管理"},{"child":[{"buttons":["新增","查看","修改","删除","查看评论"],"menu":"在线问诊","menuJump":"列表","tableName":"zaixianwenzhen"}],"menu":"在线问诊管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"评价与投诉","menuJump":"列表","tableName":"pingjiayutousu"}],"menu":"评价与投诉管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"名医讲堂","tableName":"news"},{"buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看","预约","问诊"],"menu":"医生信息列表","menuJump":"列表","tableName":"yishengxinxi"}],"menu":"医生信息模块"},{"child":[{"buttons":["查看","取消预约","评价投诉"],"menu":"挂号记录列表","menuJump":"列表","tableName":"guahaojilu"}],"menu":"挂号记录模块"},{"child":[{"buttons":["查看"],"menu":"取消挂号列表","menuJump":"列表","tableName":"quxiaoguahao"}],"menu":"取消挂号模块"},{"child":[{"buttons":["查看","评价投诉"],"menu":"在线问诊列表","menuJump":"列表","tableName":"zaixianwenzhen"}],"menu":"在线问诊模块"},{"child":[{"buttons":["查看"],"menu":"评价与投诉列表","menuJump":"列表","tableName":"pingjiayutousu"}],"menu":"评价与投诉模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["预约","问诊"],"menu":"科室信息","menuJump":"列表","tableName":"keshixinxi"}],"menu":"科室信息管理"},{"child":[{"buttons":["查看","预约","问诊"],"menu":"医生信息","menuJump":"列表","tableName":"yishengxinxi"}],"menu":"医生信息管理"},{"child":[{"buttons":["查看","取消预约","评价投诉"],"menu":"挂号记录","menuJump":"列表","tableName":"guahaojilu"}],"menu":"挂号记录管理"},{"child":[{"buttons":["查看"],"menu":"取消挂号","menuJump":"列表","tableName":"quxiaoguahao"}],"menu":"取消挂号管理"},{"child":[{"buttons":["查看","评价投诉"],"menu":"在线问诊","menuJump":"列表","tableName":"zaixianwenzhen"}],"menu":"在线问诊管理"},{"child":[{"buttons":["查看"],"menu":"评价与投诉","menuJump":"列表","tableName":"pingjiayutousu"}],"menu":"评价与投诉管理"}],"frontMenu":[{"child":[{"buttons":["查看","预约","问诊"],"menu":"医生信息列表","menuJump":"列表","tableName":"yishengxinxi"}],"menu":"医生信息模块"},{"child":[{"buttons":["查看","取消预约","评价投诉"],"menu":"挂号记录列表","menuJump":"列表","tableName":"guahaojilu"}],"menu":"挂号记录模块"},{"child":[{"buttons":["查看"],"menu":"取消挂号列表","menuJump":"列表","tableName":"quxiaoguahao"}],"menu":"取消挂号模块"},{"child":[{"buttons":["查看","评价投诉"],"menu":"在线问诊列表","menuJump":"列表","tableName":"zaixianwenzhen"}],"menu":"在线问诊模块"},{"child":[{"buttons":["查看"],"menu":"评价与投诉列表","menuJump":"列表","tableName":"pingjiayutousu"}],"menu":"评价与投诉模块"}],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"医生信息","menuJump":"列表","tableName":"yishengxinxi"}],"menu":"医生信息管理"},{"child":[{"buttons":["查看"],"menu":"挂号记录","menuJump":"列表","tableName":"guahaojilu"}],"menu":"挂号记录管理"},{"child":[{"buttons":["查看"],"menu":"取消挂号","menuJump":"列表","tableName":"quxiaoguahao"}],"menu":"取消挂号管理"},{"child":[{"buttons":["查看评论","查看"],"menu":"在线问诊","menuJump":"列表","tableName":"zaixianwenzhen"}],"menu":"在线问诊管理"},{"child":[{"buttons":["查看"],"menu":"评价与投诉","menuJump":"列表","tableName":"pingjiayutousu"}],"menu":"评价与投诉管理"}],"frontMenu":[{"child":[{"buttons":["查看","预约","问诊"],"menu":"医生信息列表","menuJump":"列表","tableName":"yishengxinxi"}],"menu":"医生信息模块"},{"child":[{"buttons":["查看","取消预约","评价投诉"],"menu":"挂号记录列表","menuJump":"列表","tableName":"guahaojilu"}],"menu":"挂号记录模块"},{"child":[{"buttons":["查看"],"menu":"取消挂号列表","menuJump":"列表","tableName":"quxiaoguahao"}],"menu":"取消挂号模块"},{"child":[{"buttons":["查看","评价投诉"],"menu":"在线问诊列表","menuJump":"列表","tableName":"zaixianwenzhen"}],"menu":"在线问诊模块"},{"child":[{"buttons":["查看"],"menu":"评价与投诉列表","menuJump":"列表","tableName":"pingjiayutousu"}],"menu":"评价与投诉模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"医生","tableName":"yisheng"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"医院信息","menuJump":"列表","tableName":"yiyuanxinxi"}],"menu":"医院信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"科室分类","menuJump":"列表","tableName":"keshifenlei"}],"menu":"科室分类管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"科室信息","menuJump":"列表","tableName":"keshixinxi"}],"menu":"科室信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"医生信息","menuJump":"列表","tableName":"yishengxinxi"}],"menu":"医生信息管理"},{"child":[{"buttons":["查看","审核"],"menu":"挂号记录","menuJump":"列表","tableName":"guahaojilu"}],"menu":"挂号记录管理"},{"child":[{"buttons":["查看"],"menu":"取消挂号","menuJump":"列表","tableName":"quxiaoguahao"}],"menu":"取消挂号管理"},{"child":[{"buttons":["查看"],"menu":"失信名单","menuJump":"列表","tableName":"shixinmingdan"}],"menu":"失信名单管理"},{"child":[{"buttons":["查看","查看评论"],"menu":"在线问诊","menuJump":"列表","tableName":"zaixianwenzhen"}],"menu":"在线问诊管理"},{"child":[{"buttons":["查看"],"menu":"评价与投诉","menuJump":"列表","tableName":"pingjiayutousu"}],"menu":"评价与投诉管理"}],"frontMenu":[{"child":[{"buttons":["查看","预约","问诊"],"menu":"医生信息列表","menuJump":"列表","tableName":"yishengxinxi"}],"menu":"医生信息模块"},{"child":[{"buttons":["查看","取消预约","评价投诉"],"menu":"挂号记录列表","menuJump":"列表","tableName":"guahaojilu"}],"menu":"挂号记录模块"},{"child":[{"buttons":["查看"],"menu":"取消挂号列表","menuJump":"列表","tableName":"quxiaoguahao"}],"menu":"取消挂号模块"},{"child":[{"buttons":["查看","评价投诉"],"menu":"在线问诊列表","menuJump":"列表","tableName":"zaixianwenzhen"}],"menu":"在线问诊模块"},{"child":[{"buttons":["查看"],"menu":"评价与投诉列表","menuJump":"列表","tableName":"pingjiayutousu"}],"menu":"评价与投诉模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"机构","tableName":"jigou"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
