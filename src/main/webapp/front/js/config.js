
var projectName = '演出道具租赁管理系统';
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
	url: '../' + localStorage.getItem('userTable') + '/center.jsp'
}, 
{
	name: '我的收藏',
	url: '../storeup/list.jsp'
}
]


var indexNav = [

{
	name: '道具出租',
	url: './pages/daojuchuzu/list.jsp'
}, 

{
	name: '公告资讯',
	url: './pages/news/list.jsp'
},
]

var adminurl =  "http://localhost:8080/jspm790m4/index.jsp";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","修改","删除"],"menu":"商家","menuJump":"列表","tableName":"shangjia"}],"menu":"商家管理"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["新增","查看","修改","删除"],"menu":"道具类型","menuJump":"列表","tableName":"daojuleixing"}],"menu":"道具类型管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","修改","删除","查看评论","审核","报表"],"menu":"道具出租","menuJump":"列表","tableName":"daojuchuzu"}],"menu":"道具出租管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","修改","删除","报表"],"menu":"租赁订单","menuJump":"列表","tableName":"zulindingdan"}],"menu":"租赁订单管理"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","修改","删除"],"menu":"发货信息","menuJump":"列表","tableName":"fahuoxinxi"}],"menu":"发货信息管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","修改","删除"],"menu":"道具归还","menuJump":"列表","tableName":"daojuguihai"}],"menu":"道具归还管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["查看","修改","删除"],"menu":"收货信息","menuJump":"列表","tableName":"shouhuoxinxi"}],"menu":"收货信息管理"},{"child":[{"appFrontIcon":"cuIcon-favor","buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告资讯","tableName":"news"},{"appFrontIcon":"cuIcon-rank","buttons":["查看","修改"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看","租赁"],"menu":"道具出租列表","menuJump":"列表","tableName":"daojuchuzu"}],"menu":"道具出租模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","删除","支付","归还"],"menu":"租赁订单","menuJump":"列表","tableName":"zulindingdan"}],"menu":"租赁订单管理"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","审核"],"menu":"发货信息","menuJump":"列表","tableName":"fahuoxinxi"}],"menu":"发货信息管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","删除","发货"],"menu":"道具归还","menuJump":"列表","tableName":"daojuguihai"}],"menu":"道具归还管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["查看"],"menu":"收货信息","menuJump":"列表","tableName":"shouhuoxinxi"}],"menu":"收货信息管理"},{"child":[{"appFrontIcon":"cuIcon-favor","buttons":["查看","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看","租赁"],"menu":"道具出租列表","menuJump":"列表","tableName":"daojuchuzu"}],"menu":"道具出租模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["新增","查看","修改","删除","查看评论"],"menu":"道具出租","menuJump":"列表","tableName":"daojuchuzu"}],"menu":"道具出租管理"},{"child":[{"appFrontIcon":"cuIcon-qrcode","buttons":["查看","删除","发货","报表"],"menu":"租赁订单","menuJump":"列表","tableName":"zulindingdan"}],"menu":"租赁订单管理"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","修改","删除"],"menu":"发货信息","menuJump":"列表","tableName":"fahuoxinxi"}],"menu":"发货信息管理"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","审核","删除"],"menu":"道具归还","menuJump":"列表","tableName":"daojuguihai"}],"menu":"道具归还管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["查看","删除","审核"],"menu":"收货信息","menuJump":"列表","tableName":"shouhuoxinxi"}],"menu":"收货信息管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-album","buttons":["查看","租赁"],"menu":"道具出租列表","menuJump":"列表","tableName":"daojuchuzu"}],"menu":"道具出租模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"是","roleName":"商家","tableName":"shangjia"}]


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
