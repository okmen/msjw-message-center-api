package cn.account.service;

import java.util.List;

import cn.account.bean.WechatUserInfoBean;
import cn.account.bean.vo.BindTheVehicleVo;
import cn.account.bean.vo.DriverLicenseInformationSheetVo;
import cn.account.bean.vo.DrivingLicenseVo;
import cn.account.bean.vo.ElectronicDriverLicenseVo;
import cn.account.bean.vo.LoginReturnBeanVo;
import cn.account.bean.vo.MotorVehicleInformationSheetVo;
import cn.account.bean.vo.MyDriverLicenseVo;
import cn.account.bean.vo.queryclassservice.CertificationProgressQueryVo;
import cn.account.bean.vo.queryclassservice.DriverLicenseBusinessVo;
import cn.account.bean.vo.queryclassservice.MakeAnAppointmentVo;
import cn.account.bean.vo.queryclassservice.MotorVehicleBusinessVo;

/**
 * @author suntao
 */
public interface IAccountService {
	
	
	/**
	 * 插入微信用户信息
	 * @param wechatUserInfo
	 * @return 成功则返回纪录id，失败返回0
	 */
	int insertWechatUserInfo(WechatUserInfoBean wechatUserInfo);
    
	/**
	 * 通过id获取用户微信信息
	 * @param id
	 * @return
	 */
	WechatUserInfoBean getWechatUserInfoById(int id);
	
	/**
	 * 获取全部对象List
	 * @return
	 */
	List<WechatUserInfoBean> getAllWechatUserInfoBeanList();
	/**
	 * 登录
	 * @return
	 * @throws Exception 
	 */
	public LoginReturnBeanVo login(String loginName,String password) throws Exception;
	/**
	 * 获取机动车信息单
	 * @param identityCard 身份证号
	 * @return
	 */
	public MotorVehicleInformationSheetVo getMotorVehicleInformationSheet(String identityCard);
	/**
     * 提交机动车信息单
     * @param userName 姓名
     * @param identityCard 身份证号
     * @param mobilephone 联系电话 
     * @param provinceAbbreviation 车牌核发省简称 例如：粤
     * @param numberPlateNumber 号牌号码 例如：B701NR
     * @param plateType 车辆类型 例如:小型汽车
     */
	public void commitMotorVehicleInformationSheet(String userName,String identityCard,
    		String mobilephone,String provinceAbbreviation,String numberPlateNumber, String plateType);
	/**
	 * 获取驾驶证信息单
	 * @param identityCard 身份证号
	 * @return
	 */
	public DriverLicenseInformationSheetVo getDriverLicenseInformationSheet(String identityCard);
	/**
	 * 提交驾驶证信息单
	 * @param userName 姓名
	 * @param identityCard 身份证号
	 * @param mobilephone 联系电话
	 * @return
	 */
	public DriverLicenseInformationSheetVo commitDriverLicenseInformationSheet(String userName,String identityCard,String mobilephone);
	/**
	 * 用户中心-查询类服务-预约查询-机动车业务/驾驶证业务
	 * @param businessType 业务类型	1-机动车业务、2-驾驶证业务
	 * @param reservationNumber 预约编号
	 * @param identityCard 身份证号
	 * @return
	 */
	public MakeAnAppointmentVo getMakeAnAppointment(int businessType,String reservationNumber,String identityCard);
	/**
	 * 用户中心-查询类服务-预约取消-机动车业务/驾驶证业务
	 * @param businessType
	 * @param reservationNumber
	 * @param identityCard
	 */
	public void bookingCancellation(int businessType,String reservationNumber,String identityCard);
	/**
	 * 用户中心-查询类服务-认证进度查询(身份认证审核/自然人认证/公车注册/车辆绑定/驾驶证绑定)
	 * @param businessType
	 * @param identityCard
	 * @param serialNumber
	 * @param agencyCode
	 * @return
	 */
	public CertificationProgressQueryVo getCertificationProgressQuery(int businessType,String identityCard,String serialNumber,String agencyCode);
	/**
	 * 用户中心-查询类服务-业务办理进度查询-驾驶证业务
	 * @param identityCard 身份证号
	 * @return
	 */
	public List<DriverLicenseBusinessVo> getDriverLicenseBusiness(String identityCard);
	/**
	 * 用户中心-查询类服务-业务办理进度查询-机动车业务
	 * @param identityCard 身份证号
	 * @return
	 */
	public List<MotorVehicleBusinessVo> getMotorVehicleBusiness(String identityCard);
	/**
	 * 用户中心-电子驾驶证
	 * @param driverLicenseNumber 驾驶证号
	 * @param userName 姓名
	 * @param mobileNumber 申请手机号码
	 * @return
	 */
	public ElectronicDriverLicenseVo getElectronicDriverLicense(String driverLicenseNumber,String userName,String mobileNumber);
	/**
	 * 用户中心-电子行驶证
	 * @param numberPlatenumber 号牌号码
	 * @param plateType 号牌种类
	 * @param mobileNumber 申请手机号码
	 * @return
	 */
	public DrivingLicenseVo getDrivingLicense(String numberPlatenumber,String plateType,String mobileNumber);
	/**
	 * 用户中心-我的驾驶证
	 * @param identityCard 身份证号
	 */
	public MyDriverLicenseVo getMyDriverLicense(String identityCard);
	/**
	 * 用户中心-查询已绑车辆
	 * @param identityCard 身份证号
	 */
	public List<BindTheVehicleVo> getBndTheVehicles(String identityCard);
//	/**
//	 * 添加新用户
//	 * 
//	 * @param UserRegInfo userRegInfo
//	 * @return
//	 */
//	public UserRegInfo addNewUser(UserRegInfo userRegInfo);
//	
//	
//	/**
//     * 根据userId来获取accessToken
//     * 
//     * @param userId
//     * @return
//     */
//    public String getAccessTokenByUserId(long userId);
//
//    /**
//     * 获取缓存的加密accessToken和accessToken的对应关系
//     * 
//     * @param encyptAccessToken
//     * @return
//     */
//    public String getAccessTokenFromEncypt(String encyptAccessToken);
//
//    /**
//     * 插入加密accessToken和accessToken的对应关系
//     * 
//     * @param encyptAccessToken
//     * @param AccessToken
//     */
//    public void insertEncyptAccessToken(String encyptAccessToken, String AccessToken);
//    
//    /**
//     * 获取并插入Token
//     * @param userId
//     * @return
//     */
//    public Token getAccessToken(long userId);
//    
//    
//    /**
//     * 检查accessToken是否过期
//     * 
//     * @param accessToken
//     * @param userId
//     * @return 是否成功
//     */
//    public boolean isAccessTokenValidate(String accessToken, String userId);
//    
//    /**
//     * 根据refreshToken来获取accessToken
//     * 
//     * @param refreshToken
//     * @return 是否成功
//     */
//    public Map<String, String> getAccessTokenByRefreshToken(String userId, String refreshToken);
//    
//    /**
//     * 绑定微信
//     * 
//     * @param userOpenidBean
//     * @author shengfenglai
//     * @return long
//     */
//    public long  addBindOpenid(UserOpenidBean userOpenidBean);
//    
//    /**
//     * 取消绑定微信
//     * 
//     * @param userOpenidBean
//     * @author shengfenglai
//     * @return long 
//     */
//    public long cancelBindOpenid(UserOpenidBean userOpenidBean);
//    
//    /**
//     * 通过openid拿到userId
//     * @param openid
//     * @return userId
//     * @author shengfenglai
//     */
//    public long getUserIdByOpenid(String openid);
//    
//    /**
//     * 通过userId拿到openid
//     * @param userId 
//     * @return 
//     * @author shengfenglai
//     */
//    public String getOpenidByUserId(long userId);
//    
//    /**
//     * 获取DeviceBean
//     * @param deviceUuid 设备号
//     * @param osType 系统类型
//     * @return
//     */
//    public DeviceBean getDevice(String deviceUuid,int osType);
//    
//    /**
//     * 记录设备号
//     * @param deviceUuid 设备号
//     * @param osType 系统类型
//     * @param userId 用户id
//     */
//    public void addDevice(String deviceUuid,int osType,long userId);
//    
//    /**
//     * 更新cm_devices表的user_id
//     * @param deviceUuid 设备号
//     * @param osType 系统类型
//     * @param userId 用户id
//     * @return
//     */
//    public boolean updateDevice(String deviceUuid,int osType,long userId);
//    
    
}
