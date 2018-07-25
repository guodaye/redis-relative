-- 如果第五个参数是nil 表示是加锁操作，否则为释放锁操作
local executeLocked = (ARGV[5] == nil) and true or false

if executeLocked then
    return true;
else
    return false;
end

-- 加锁
--if redis.call('set', KEYS[1], ARGV[2], ARGV[3], tonumber(ARGV[4]), ARGV[5]) then
--    return true
--else
--    return false
--end

