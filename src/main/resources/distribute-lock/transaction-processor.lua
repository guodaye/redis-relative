local executeType = tonumber(ARGV[1]);

if executeType == 1 then
    local aliveNodeList = redis.call('keys', KEYS[1]);
    local deadNode = {}
    local deadNodeIndex = 0
    for i, v in aliveNodeList do
        if (redis.call('sisMember', KEYS[3], v) == false) then
            deadNode[deadNodeIndex] = v
            deadNodeIndex = deadNodeIndex + 1
        end
    end
    return deadNode -- 返回所有已经死掉的节点
elseif executeType == 2 then
    return false
else
    return true;
end